/* This packet is probably sent with MAP to update map stuff */
/* https://wiki.vg/Protocol#Map_Data */
/* Not sure about the difference */

map_chunk.getIntegers().read(0); // Chunk X
map_chunk.getIntegers().read(1); // Chunk Z

map_chunk.getBooleans().read(0); // getGroundUpContinuous
map_chunk.getIntegers().read(2); // Bitmask

/**
 * Bitmask with bits set to 1 for every 16×16×16 chunk section whose data is
 * included in Data. The least significant bit represents the chunk section at
 * the bottom of the chunk column (from y=0 to y=15).
 */

map_chunk.getByteArrays().read(0); // Data
/* http://wiki.vg/Chunk_Format#Data_structure */

map_chunk.getListNbtModifier().read(0); // Return all block entities in the chunk
