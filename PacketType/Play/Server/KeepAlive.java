/* The server will frequently send out a keep-alive, each containing a random ID. The client must respond with the same packet. */
/* Cancelling this will cause the player to time out */

keep_alive.getLongs().read(0); // Keep Alive ID
