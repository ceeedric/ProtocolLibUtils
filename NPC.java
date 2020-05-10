        PacketContainer player_info_packet = new PacketContainer(PacketType.Play.Server.PLAYER_INFO);
        UUID uuid = UUID.randomUUID();
        WrappedGameProfile gameProfile = new WrappedGameProfile(uuid, "bomdia");
        String[] skin = getSkin(args[0], gameProfile);
        gameProfile.getProperties().put("textures", new WrappedSignedProperty("textures", skin[0], skin[1]));
        PlayerInfoData playerInfoData = new PlayerInfoData(gameProfile, 100, EnumWrappers.NativeGameMode.SURVIVAL,
                null);
        List<PlayerInfoData> list = new ArrayList<>();
        list.add(playerInfoData);
        player_info_packet.getPlayerInfoAction().write(0, EnumWrappers.PlayerInfoAction.ADD_PLAYER);
        player_info_packet.getPlayerInfoDataLists().write(0, list);


// skin code stolen straight from cmaaxx, thanks.




        PacketContainer spawn_packet = new PacketContainer(PacketType.Play.Server.NAMED_ENTITY_SPAWN);

        spawn_packet.getUUIDs().write(0, uuid);

        Location loc = p.getLocation();
        spawn_packet.getDoubles().write(0, loc.getX())
                .write(1, loc.getY())
                .write(2, loc.getZ());

        spawn_packet.getIntegers().write(0, 1000);

        spawn_packet.getBytes().write(0, (byte) loc.getYaw());
        spawn_packet.getBytes().write(1, (byte) loc.getPitch());

        pm.broadcastServerPacket(player_info_packet);
        pm.broadcastServerPacket(spawn_packet);

private static String[] getSkin(String name, WrappedGameProfile gameProfile) {
        try {
            URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + name);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            String uuid = new JsonParser().parse(reader).getAsJsonObject().get("id").getAsString();

            URL url2 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid
                    + "?unsigned=false");
            InputStreamReader reader2 = new InputStreamReader(url2.openStream());
            JsonObject property = new JsonParser().parse(reader2).getAsJsonObject().get("properties")
                    .getAsJsonArray().get(0).getAsJsonObject();
            String texture = property.get("value").getAsString();
            String signature = property.get("signature").getAsString();
            return new String[]{texture, signature};

        } catch (Exception e) {

            WrappedGameProfile profile = gameProfile;
            WrappedSignedProperty property = profile.getProperties().get("textures").iterator().next();
            String texture = property.getValue();
            String signature = property.getSignature();
            return new String[]{texture, signature};

        }
    }

