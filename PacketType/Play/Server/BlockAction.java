// This packet is sent when a block performs an action.
// Blocks affected by this: 
// Note Block, Piston, Sticky Piston, Chest, Trapped Chest, Ender Chest, Beacon, Mob Spawner, End Gateway, and Shulker Box.

block_action.getBlockPositionModifier().read(0); // Block location
block_action.getIntegers().read(0); // Block Action ID
block_action.getIntegers().read(1); // Parameter, not necessary if ignored. Check blocks below to see which blocks ignore parameters
block_action.getBlocks().read(0); // Returns the block type (Material.(something))

      /*
      Note Block

      Action ID: Ignored
      Parameter: Ignored

        */

      /*
      Piston

      Action IDs: 0 to extend the piston, 1 to retract.

      Action Parameters:
      0	Down
      1	Up
      2	South
      3	West
      4	North
      5	East
       */
 
      /*
      Chest

      Action IDs: 1 <-- this is used to update the number of players that are looking at the chest

      Action Parameters:
      When the Action ID is 1, it will return the amount of players who have the chest opened. If the action ID is 0,
      the chest is closed.
        */
        
      /*
      Ender Chest

      Action IDs: 1
      This is used to update the number of players who are currently looking at the ender chest,
      which in turn is used to update the lid animation. Recalculated every 80 ticks (4s)

      Action Parameters: 1
      When the action ID is 1, this is the number of players who have the chest open.
      If 0, then the chest is closed; 
      if 1 or more the ender chest is open.
        */
        
      /*
      Beacon

      Action IDs: 1
      It is used to tell the client to recalculate the beacon beam.
      This happens whenever the beacon base receives a block update.
      Additionally, whenever a stained glass block or stained glass pane is placed above a beacon that can see the sky.
      The client goes through all blocks above the beacon,
      disabling/enabling the beam if it is covered and recoloring the beam if it passes through glass or stained glass.

      Action Parameter: Ignored

      */

      /*
      Spawner

      Action IDs: 1
      Resets the delay in the spawner to the minimum spawn delay.

      Action Parameter: Ignored

       */

      /*
      End gateway

      Action IDs: 1
      Triggers the purple beam emitted by the end gateway when an entity passes through it.

      Action Parameter: Ignored


       */

      /*
      Shulker Box

      Action IDs: 1
      Updates the number of players who are looking in the shulker box.

      Action parameters: 1
      If the action is 1, updates the number of players who have the shulker box open.
      If 0, the shulker box enters its closing animation; if 1, the shulker box enters its opening animation.
       */
