package com.google.gwt.user.client.rpc.core.java.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

import java.util.UUID;

public class UUID_CustomFieldSerializer {
	public static void deserialize(SerializationStreamReader reader, UUID instance) throws SerializationException {
		// Do nothing, everything is done in instantiate
	}

	public static UUID instantiate(SerializationStreamReader reader) throws SerializationException {
		return UUID.fromString(reader.readString());
	}

	public static void serialize(SerializationStreamWriter writer, UUID instance) throws SerializationException {
		writer.writeString(instance.toString());
	}
}