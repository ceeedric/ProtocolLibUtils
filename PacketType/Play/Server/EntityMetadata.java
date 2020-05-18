/* This packet is sent when an entity metadata's changes */
/* https://wiki.vg/Entity_metadata#Entity_Metadata_Format */

PacketContainer entity_metadata = e.getPacket();
World world = e.getPlayer().getWorld();

entity_metadata.getIntegers().read(0); // Returns entity ID
entity_metadata.getEntityModifier(world).read(0); // Returns Entity
entity_metadata.getWatchableCollectionModifier().read(0); // Returns a List<WrappedDataWatcher> this is how ProtocolLib represents metadata
