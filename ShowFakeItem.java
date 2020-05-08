PacketContainer packet = new PacketContainer(PacketType.Play.Server.ENTITY_EQUIPMENT);
        packet.getIntegers().write(0, p.getEntityId());
        packet.getEntityModifier(p.getWorld()).write(0, p);

        packet.getItemSlots().write(0, EnumWrappers.ItemSlot.MAINHAND);
        packet.getItemModifier().write(0, new ItemStack(Material.DIAMOND_BLOCK));

        for (Player a : Bukkit.getOnlinePlayers()) {
            try {
                if (!a.getName().equals(p.getName())) {
                    ProtocolLibrary.getProtocolManager().sendServerPacket(a, packet, true);
                }
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
