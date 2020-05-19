/* Sent every time you load a chunk to set up light leveles */

light_update.getIntegers().read(0); // Chunk X
light_update.getIntegers().read(1); // Chunk Z
light_update.getIntegers().read(2); // Sky light mask
light_update.getIntegers().read(3); // Block light mask
light_update.getIntegers().read(4); // Empty Sky light mask
light_update.getIntegers().read(5); // Empty Block light mask
light_update.getBlockPositionCollectionModifier().read(0); // Blocks with sky light, returns List<BlockPosition>
light_update.getBlockPositionCollectionModifier().read(1); // Sky light array


/* Please check the wiki for more information on those values */
/* https://wiki.vg/Protocol#Update_Light */
