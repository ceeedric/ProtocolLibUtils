/* Sent when a player logs on */


login.getDimensions().read(0); // Returns 0, I assume this means the first world in the world list

login.getLongs().read(0); // Returns a big number, no idea what it is

login.getIntegers().read(0); // Entity ID
login.getIntegers().read(1); // hp?
login.getIntegers().read(2); // ?

login.getGameModes().read(0); // Native GameMode

login.getBooleans().read(0); // ?
login.getBooleans().read(1); // ?
login.getBooleans().read(2); // ?

login.getWorldTypeModifier().read(0); // World Type, bukkit ones
