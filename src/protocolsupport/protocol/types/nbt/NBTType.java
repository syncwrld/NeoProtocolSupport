package protocolsupport.protocol.types.nbt;

import java.util.Objects;

public class NBTType<T extends NBT> {

	public static final NBTType<NBTEnd> END = new NBTType<>(NBTEnd.class);
	public static final NBTType<NBTByte> BYTE = new NBTType<>(NBTByte.class);
	public static final NBTType<NBTShort> SHORT = new NBTType<>(NBTShort.class);
	public static final NBTType<NBTInt> INT = new NBTType<>(NBTInt.class);
	public static final NBTType<NBTLong> LONG = new NBTType<>(NBTLong.class);
	public static final NBTType<NBTFloat> FLOAT = new NBTType<>(NBTFloat.class);
	public static final NBTType<NBTDouble> DOUBLE = new NBTType<>(NBTDouble.class);
	public static final NBTType<NBTByteArray> BYTE_ARRAY = new NBTType<>(NBTByteArray.class);
	public static final NBTType<NBTString> STRING = new NBTType<>(NBTString.class);
	@SuppressWarnings("rawtypes")
	public static final NBTType<NBTList> LIST = new NBTType<>(NBTList.class);
	public static final NBTType<NBTCompound> COMPOUND = new NBTType<>(NBTCompound.class);
	public static final NBTType<NBTIntArray> INT_ARRAY = new NBTType<>(NBTIntArray.class);
	public static final NBTType<NBTLongArray> LONG_ARRAY = new NBTType<>(NBTLongArray.class);

	protected final Class<T> clazz;

	protected NBTType(Class<T> clazz) {
		this.clazz = clazz;
	}

	public Class<T> getNBTClass() {
		return clazz;
	}

	@Override
	public String toString() {
		return clazz.getSimpleName();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		NBTType<T> other = (NBTType<T>) obj;
		return Objects.equals(clazz, other.clazz);
	}

	@Override
	public int hashCode() {
		return clazz.hashCode();
	}

}
