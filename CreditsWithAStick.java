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


//    This code allows you to send packets inside packet listeners. In this case, every time a player hits another with a stick, 
//    the other player will get the credits message.
//
//    The runnable there makes it possible to send a packet inside a packet listener,
//    if you dont have that console sends some "cant do that asynchrouasogfhly blablabla"
//
//    thanks to bingo who showed me how to make a runnable


