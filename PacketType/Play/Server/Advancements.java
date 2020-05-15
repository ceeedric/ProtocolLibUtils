    // This packet is sent when a player joins so that the server knows which advancements they have and when an advancement is completed.
    // The code is pretty complex, you need quite a few stuff before getting the actual value
    
    
    public enum FrameType {
        TASK,
        CHALLENGE,
        GOAL
    }

    public static class CriterionProgress {
        public AdvancementProgress progress;
        public Date date;
    }

    public static class AdvancementDisplay {
        public WrappedChatComponent title;
        public WrappedChatComponent description;
        public ItemStack icon;
        public MinecraftKey background;
        public FrameType frame;
        public boolean showToast;
        public boolean announceToChat;
        public boolean hidden;
        public float xCoord;
        public float yCoord;
    }

    public static class SerializedAdvancement {
        public MinecraftKey key;
        public Advancement advancement;
        public AdvancementDisplay display;
        public Object rewards;
        public Map<String, Object> criteria;
        public String[][] requirements;
    }
    
    
    PacketContainer advancements = e.getPacket();
    final AutoWrapper<AdvancementDisplay> DISPLAY = AutoWrapper
            .wrap(AdvancementDisplay.class, "AdvancementDisplay")
            .field(0, BukkitConverters.getWrappedChatComponentConverter())
            .field(1, BukkitConverters.getWrappedChatComponentConverter())
            .field(2, BukkitConverters.getItemStackConverter())
            .field(3, MinecraftKey.getConverter())
            .field(4, EnumWrappers.getGenericConverter(getMinecraftClass("AdvancementFrameType"), FrameType.class));

    final AutoWrapper<SerializedAdvancement> WRAPPER = AutoWrapper
            .wrap(SerializedAdvancement.class,"Advancement$SerializedAdvancement")
            .field(0, MinecraftKey.getConverter())
            .field(1, BukkitConverters.getAdvancementConverter())
            .field(2, DISPLAY);

    final AutoWrapper<CriterionProgress> CRITERION = AutoWrapper
            .wrap(CriterionProgress.class, "CriterionProgress");

    final AutoWrapper<AdvancementProgress> PROGRESS = AutoWrapper
            .wrap(AdvancementProgress.class, "AdvancementProgress")
            .field(0, BukkitConverters.getMapConverter(Converters.passthrough(String.class), CRITERION));

    advancements.getBooleans().read(0);
    advancements.getMaps(MinecraftKey.getConverter(), WRAPPER).read(0);
    advancements.getSets(MinecraftKey.getConverter()).optionRead(0);
    advancements.getMaps(MinecraftKey.getConverter(), PROGRESS).read(1);
