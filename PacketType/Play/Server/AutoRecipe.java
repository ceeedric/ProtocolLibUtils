// This packet sent when you try to autocraft something that you do not have resources for.
// So say you click on the Recipe and try to craft a diamond sword while not having any diamonds in your inventory, 
// this packet will be sent.

PacketContainer auto_recipe = e.getPacket();
auto_recipe.getIntegers().read(0); // Returns window ID
