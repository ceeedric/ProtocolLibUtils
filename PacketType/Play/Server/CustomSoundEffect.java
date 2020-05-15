/* This might be used to play custom effects, the difference between this and NamedSoundEffect is unknown */
PacketContainer custom_sound_effect = e.getPacket();
custom_sound_effect.getMinecraftKeys().read(0); // returns sound name

custom_sound_effect.getIntegers().read(0); // Returns x coordinate
custom_sound_effect.getIntegers().read(1); // Returns y coordinate
custom_sound_effect.getIntegers().read(2); // Returns z coordinate

custom_sound_effect.getFloat().read(0); // Volume, 1 is 100%, can be more

custom_sound_effect.getFloat().read(1); // Pitch, 63 is 100%, can be more

custom_sound_effect.getSoundCategories().read(0); // returns sound category as listed below
/*
* MASTER("master"),
* MUSIC("music"),
* RECORDS("record"),
* WEATHER("weather"),
* BLOCKS("block"),
* HOSTILE("hostile"),
* NEUTRAL("neutral"),
* PLAYERS("player"),
* AMBIENT("ambient"),
* VOICE("voice");
*/
