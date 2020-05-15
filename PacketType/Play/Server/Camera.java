// Sent when a player in spectator mode left clicks an entity and starts to see what they see and move where they move
// The entity is usually another player but could be any type of entity

PacketContainer camera = new PacketContainer(PacketType.Play.Server.CAMERA);
camera.getIntegers().read(0); // returns the entity's id
