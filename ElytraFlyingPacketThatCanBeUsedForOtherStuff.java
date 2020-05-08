public void sendFlyingWithElytraPacket (Player p) {
        PacketContainer packet = new PacketContainer(PacketType.Play.Server.ENTITY_METADATA);

        WrappedDataWatcher watcher = new WrappedDataWatcher();
        WrappedDataWatcher.Serializer serializer = WrappedDataWatcher.Registry.get(Byte.class);
        watcher.setEntity(p);
        watcher.setObject(0, serializer, (byte) (0x80));

        packet.getIntegers().write(0, p.getEntityId());
        packet.getWatchableCollectionModifier().write(0, watcher.getWatchableObjects());

        ProtocolLibrary.getProtocolManager().broadcastServerPacket(packet, p, false);




    }
    
    // This can also be used for other animations by changing byte value
    // here are the possible byte values:
    
    // 0x01	On Fire
    // 0x02	Crouched
    // 0x04	Unused (previously riding)
    // 0x08	Sprinting
    // 0x10	Swimming
    // 0x20	Invisible
    // 0x40	Glowing effect
    // 0x80	Flying with elytra
    
    // info from https://wiki.vg/Entity_metadata#Entity_Metadata_Format
    
