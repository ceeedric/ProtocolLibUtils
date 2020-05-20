public enum MapIconType {
        PLAYER,
        FRAME,
        RED_MARKER,
        BLUE_MARKER,
        TARGET_X,
        TARGET_POINT,
        PLAYER_OFF_MAP,
        PLAYER_OFF_LIMITS,
        MANSION,
        MONUMENT,
        BANNER_WHITE,
        BANNER_ORANGE,
        BANNER_MAGENTA,
        BANNER_LIGHT_BLUE,
        BANNER_YELLOW,
        BANNER_LIME,
        BANNER_PINK,
        BANNER_GRAY,
        BANNER_LIGHT_GRAY,
        BANNER_CYAN,
        BANNER_PURPLE,
        BANNER_BLUE,
        BANNER_BROWN,
        BANNER_GREEN,
        BANNER_RED,
        BANNER_BLACK,
        RED_X;
    }

    public static class MapIcon {
        public MapIconType type;
        public byte x;
        public byte y;
        public byte rotation;
        public WrappedChatComponent name;
    }

    private static final AutoWrapper<MapIcon> ICON_WRAPPER = AutoWrapper.wrap(MapIcon.class, "MapIcon")
            .field(0, EnumWrappers.getGenericConverter(MinecraftReflection.getMinecraftClass("MapIcon$Type"), MapIconType.class))
            .field(4, BukkitConverters.getWrappedChatComponentConverter());





/* Updates a rectangular area on a map item */

map.getIntegers().read(0); // Damage value of the map being modified
map.getIntegers().read(1); // Columns
map.getIntegers().read(2); // Rows
map.getIntegers().read(3); // X
map.getIntegers().read(4); // Z



map.getBooleans().read(0); // getTrackingPosition
map.getBooleans().read(1); // isLocked

getMapIcons(map); // For Icons



map.getByteArrays().read(0); // Returns Data
map.getBytes().read(0); // Map scale







public MapIcon[] getMapIcons(PacketContainer packet) {
        Object[] iconHandles = (Object[]) packet.getModifier().read(4);
        MapIcon[] wrappers = new MapIcon[iconHandles.length];

        for (int i = 0; i < iconHandles.length; i++) {
            wrappers[i] = ICON_WRAPPER.getSpecific(iconHandles[i]);
        }

        return wrappers;
    }

    public void setMapIcons(MapIcon[] value, PacketContainer packet) {
        Object[] iconHandles = new Object[value.length];

        for (int i = 0; i < value.length; i++) {
            iconHandles[i] = ICON_WRAPPER.getGeneric(value[i]);
        }

        packet.getModifier().write(4, iconHandles);
    }
