        PacketContainer player_info_packet = new PacketContainer(PacketType.Play.Server.PLAYER_INFO);
        UUID uuid = UUID.randomUUID();
        WrappedGameProfile gameProfile = new WrappedGameProfile(uuid, "bomdia");
        PlayerInfoData playerInfoData = new PlayerInfoData(gameProfile, 100, EnumWrappers.NativeGameMode.SURVIVAL,
                null);
        List<PlayerInfoData> list = new ArrayList<>();
        list.add(playerInfoData);
        player_info_packet.getPlayerInfoAction().write(0, EnumWrappers.PlayerInfoAction.ADD_PLAYER);
        player_info_packet.getPlayerInfoDataLists().write(0, list);







        PacketContainer spawn_packet = new PacketContainer(PacketType.Play.Server.NAMED_ENTITY_SPAWN);

        spawn_packet.getUUIDs().write(0, uuid);
        Location loc = p.getLocation();
        spawn_packet.getDoubles().write(0, loc.getX())
                .write(1, loc.getY())
                .write(2, loc.getZ());



        spawn_packet.getIntegers().write(0, 1000);


        spawn_packet.getBytes().write(0, (byte) loc.getYaw());
        spawn_packet.getBytes().write(1, (byte) loc.getPitch());


        PacketContainer entity_head_rot = new PacketContainer(PacketType.Play.Server.ENTITY_HEAD_ROTATION);
        entity_head_rot.getBytes().write(0, (byte) (loc.getYaw() * 256 / 360));
        entity_head_rot.getIntegers().write(0, 1000);

        pm.broadcastServerPacket(player_info_packet);
        pm.broadcastServerPacket(spawn_packet);

