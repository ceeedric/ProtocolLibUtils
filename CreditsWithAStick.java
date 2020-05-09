pm.addPacketListener(new PacketAdapter(this, ListenerPriority.NORMAL,
                PacketType.Play.Client.USE_ENTITY) {
            @Override
            public void onPacketReceiving(PacketEvent e) {
                PacketContainer packet = e.getPacket();
                Entity entity = packet.getEntityModifier(e.getPlayer().getWorld()).read(0);
                if (entity instanceof Player) {
                    Player target = (Player) entity;

                    // check for item, for now, nothing.

                    // call custom event

                    if (e.getPlayer().getInventory().getItemInMainHand().getType() == Material.STICK) {
                        if (packet.getEntityUseActions().read(0) == EnumWrappers.EntityUseAction.ATTACK) {
                            //send packet somehow

                            new Runnable() {
                                @Override
                                public void run() {

                                    PacketContainer anotherPacket = new PacketContainer(PacketType.Play.Server.GAME_STATE_CHANGE);
                                    anotherPacket.getIntegers().write(0, 4);
                                    anotherPacket.getFloat().write(0, 1F);
                                    try {
                                        ProtocolLibrary.getProtocolManager().sendServerPacket(target, anotherPacket, true);
                                    } catch (InvocationTargetException ex) {
                                        ex.printStackTrace();
                                    }


                                }
                            }.run();
                        }
                    }
                }
            }
        });
