WrappedDataWatcher.Serializer serializer = WrappedDataWatcher.Registry.get(Byte.class);
WrappedDataWatcher.Serializer serializer2 = WrappedDataWatcher.Registry.get(String.class);
WrappedDataWatcher.Serializer serializer3 = WrappedDataWatcher.Registry.get(Boolean.class);
WrappedDataWatcher.Serializer serializer4 = WrappedDataWatcher.Registry.get(Integer.class);

List<WrappedWatchableObject> objectList = new ArrayList<>();
WrappedWatchableObject watchableObject = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(0, serializer), (byte) 0);
WrappedWatchableObject watchableObject2 = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(1, serializer4), 300);
WrappedWatchableObject watchableObject3 = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(2, serializer2), "");
WrappedWatchableObject watchableObject4 = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(3, serializer3), false);
WrappedWatchableObject watchableObject5 = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(4, serializer3), false);
WrappedWatchableObject watchableObject6 = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(5, serializer3), false);
WrappedWatchableObject watchableObject7 = new WrappedWatchableObject(new WrappedDataWatcher.WrappedDataWatcherObject(6, serializer4), 0);


// This how you create metadata for ENTITY_METADATA packet
