package protocolsupport.protocol.codec;

import java.text.MessageFormat;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntBiFunction;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import protocolsupport.protocol.utils.EnumConstantLookup;

public class MiscDataCodec {

	private MiscDataCodec() {
	}

	public static <T extends Enum<T>> T readVarIntEnum(ByteBuf from, EnumConstantLookup<T> lookup) {
		return lookup.getByOrdinal(VarNumberCodec.readVarInt(from));
	}

	public static <T extends Enum<T>> T readByteEnum(ByteBuf from, EnumConstantLookup<T> lookup) {
		return lookup.getByOrdinal(from.readByte());
	}

	public static void writeVarIntEnum(ByteBuf to, Enum<?> e) {
		VarNumberCodec.writeVarInt(to, e.ordinal());
	}

	public static void writeByteEnum(ByteBuf to, Enum<?> e) {
		to.writeByte(e.ordinal());
	}

	public static byte[] readAllBytes(ByteBuf buf) {
		return MiscDataCodec.readBytes(buf, buf.readableBytes());
	}

	public static ByteBuf readAllBytesSlice(ByteBuf from) {
		return from.readSlice(from.readableBytes());
	}

	public static ByteBuf readAllBytesSlice(ByteBuf buf, int limit) {
		checkLimit(buf.readableBytes(), limit);
		return readAllBytesSlice(buf);
	}

	public static byte[] readBytes(ByteBuf buf, int length) {
		byte[] result = new byte[length];
		buf.readBytes(result);
		return result;
	}

	protected static void checkLimit(int length, int limit) {
		if (length > limit) {
			throw new DecoderException(MessageFormat.format("Size {0} is bigger than allowed {1}", length, limit));
		}
	}


	public static <T> void writeVarIntCountPrefixedType(ByteBuf to, T type, ToIntBiFunction<ByteBuf, T> typeWriter) {
		writeCountPrefixedType(to, VarNumberCodec::writeFixedSizeVarInt, type, typeWriter);
	}

	public static <T> void writeCountPrefixedType(ByteBuf to, ObjIntConsumer<ByteBuf> sizeWriter, T type, ToIntBiFunction<ByteBuf, T> dataWriter) {
		int sizeWriterIndex = to.writerIndex();
		sizeWriter.accept(to, 0);
		int size = dataWriter.applyAsInt(to, type);
		int writerIndexDataEnd = to.writerIndex();
		to.writerIndex(sizeWriterIndex);
		sizeWriter.accept(to, size);
		to.writerIndex(writerIndexDataEnd);
	}

	public static <T> void writeVarIntLengthPrefixedType(ByteBuf to, T type, BiConsumer<ByteBuf, T> typeWriter) {
		writeLengthPrefixedType(to, VarNumberCodec::writeFixedSizeVarInt, type, typeWriter);
	}

	public static <T> void writeShortLengthPrefixedType(ByteBuf to, T type, BiConsumer<ByteBuf, T> typeWriter) {
		writeLengthPrefixedType(to, ByteBuf::writeShort, type, typeWriter);
	}

	public static <T> void writeLengthPrefixedType(ByteBuf to, ObjIntConsumer<ByteBuf> lengthWriter, T data, BiConsumer<ByteBuf, T> typeWriter) {
		int lengthWriterIndex = to.writerIndex();
		lengthWriter.accept(to, 0);
		int writerIndexDataStart = to.writerIndex();
		typeWriter.accept(to, data);
		int writerIndexDataEnd = to.writerIndex();
		to.writerIndex(lengthWriterIndex);
		lengthWriter.accept(to, writerIndexDataEnd - writerIndexDataStart);
		to.writerIndex(writerIndexDataEnd);
	}

}
