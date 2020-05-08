public PacketContainer getPacket (ItemStack item, EnumWrappers.ItemSlot slot, Player player) {
        PacketContainer packet = new PacketContainer(PacketType.Play.Server.ENTITY_EQUIPMENT);
        packet.getIntegers().write(0, player.getEntityId());
        packet.getItemSlots().write(0, slot);
        packet.getItemModifier().write(0, item);

        return packet;

    }

    public void sendFakeArmorPacket (Player target) {

        ProtocolManager pm = ProtocolLibrary.getProtocolManager();

        PacketContainer helmetPacket = getPacket(new ItemStack(Material.GLASS), EnumWrappers.ItemSlot.HEAD, target);
        PacketContainer chestplatePacket = getPacket(new ItemStack(Material.IRON_CHESTPLATE), EnumWrappers.ItemSlot.CHEST, target);
        PacketContainer legsPacket = getPacket(new ItemStack(Material.IRON_LEGGINGS), EnumWrappers.ItemSlot.LEGS, target);
        PacketContainer bootsPacket = getPacket(new ItemStack(Material.IRON_BOOTS), EnumWrappers.ItemSlot.FEET, target);

        pm.broadcastServerPacket(helmetPacket);
        pm.broadcastServerPacket(chestplatePacket);
        pm.broadcastServerPacket(legsPacket);
        pm.broadcastServerPacket(bootsPacket);
    }
