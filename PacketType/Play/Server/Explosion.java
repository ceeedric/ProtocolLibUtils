/* This packet is sent when any explosion occurs */


explosion.getDoubles().read(0); // X coord
explosion.getDoubles().read(1); // Y coord
explosion.getDoubles().read(2); // Z coord

explosion.getFloat().read(0); // Radius


explosion.getFloat().read(1); // Velocity X
explosion.getFloat().read(2); // Velocity Y
explosion.getFloat().read(3); // Velocity Z


/* These things are also part of this packet but were empty when I tested */
explosion.getModifier().read(0); 
explosion.getBlockPositionCollectionModifier().read(0);
explosion.getItemListModifier().read(0);
explosion.getListNbtModifier().read(0);
explosion.getPositionCollectionModifier().read(0);
explosion.getWatchableCollectionModifier().read(0);
explosion.getAttributeCollectionModifier().read(0);
