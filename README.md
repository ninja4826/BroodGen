# BroodGen  
## Concept  
### Android based Starcraft: Brood War Build Order generator  
## Package Explanation  
* **bgen.info**  
  * _Build.java_  
    * Updates build list and checks through requirements to make sure that requirements of each object are somewhere in build order. Still need make Ordering methods.  
  * _Struct.java_  
    * Parent class for all structures. Constitutes get method which returns `Object[][]`.
  * _Unit.java_  
    * Parent class for all units. Constitutes get method which returns `Object[][]`.
  * _Upgrade.java_
    * Parent class for all upgrades. Constitutes get method which returns `Object[][]`.
* **bgen.game**  
  * _CurrentGame.java_  
    * Instantiated game. Used to track resources and entities.  
  * _GameEngine.java_  
    * Game Initializor. Constitutes pre-game values for resources  
* **bgen.info._Race_**  
  * Layout for these objects are as follows:  
  ```java
  public class Entity extends EntityType{
      public Entity() {

        /*
         * objectAttribute is normally used in
         * Entity.produce. This takes only one Entity
         * where as objectAttributeArray
         * will accept more than one.
         */

        Entity.objectAttribute = new AttributeEntity();

        /*
         * objectAttributeArray is normally used
         * for the Entity.reqs attribute.
         * This takes more than one Entity,
         * but it is possible to use none or one.
         * Although this example only shows two
         * Entities, it can take an infinite amount.
         */

        Entity.objectAttributeArray = new Object[]{new ObjectEntity1(), new ObjectEntity2()};

        /*
         * resourceOrInteger is used for many
         * different attributes including, but not
         * limited to supply, minerals, gas,
         * and time.
         */

        Entity.resourceOrInteger = resourceAttributeOrIntegerAttribute;

        /*
         * resourceAttributeArray is used when
         * a resource or integer needs multiple
         * values. This is used exclusively for
         * Upgrades.
         */
        Entity.resourceAttributeArray = new int[]{resourceCost1, resourceCost2};
      }
  }
  ```
  * **Structs**  
    * List of Structures. Each structure extends bgen.info.Struct.
    * Attributes are as follows:
      * `Structure` replaces `Entity`
      * `Struct` replaces `EntityType`

      * `Structure.reqs = new Object[]{new RequirementObject1(), new RequirementObject2()};`
        * Requirements for Structure to be built. Can be none, one, or many.
      * `Structure.minerals = mineralCost;`
        * Mineral cost for Structure.
      * `Structure.gas = gasCost;`
        * Gas cost for Structure.
      * `Structure.time = timeToBuild;`
        * Time Structure takes to build.

  * **Units**
    * List of Units. Each unit extends bgen.info.Unit.
    * Attributes are as follows:
      * `Uni` replaces `Entity`
      * `Uni` replaces `EntityType`
      * `Uni.produce = new ProducingObject();`
        * Object that produces Unit.
      * `Uni.reqs = new Object[]{new RequirementObject1(), new RequirementObject2()};`
        * Requirements for Unit to be trained.
      * `Uni.supply = supplyCost;`
        * Supply cost for Unit.
      * `Uni.minerals = mineralCost;`
        * Mineral cost for Unit.
      * `Uni.gas = gasCost;`
        * Gas cost for Unit.
      * `Uni.time = timeToTrain;`
        * Time Unit takes to train.

  * **Upgrades**
    * List of Upgrades. Each upgrade extends bgen.info.Upgrade.
    * Attributes are as follows.
      * `Upg` replaces `Entity`
      * `Upgrade` replaces `EntityType`
      * `Upg.produce = new ProducingObject();`
        * Object that produces Upgrade.
      * `Upg.reqs = new Object[]{new RequirementObject1(), new RequirementObject2()};`
        * Requirements for Upgrade to be researched.
      * `Upg.minerals = new int[]{mineralBaseCost, levelFactor};`
        * The first object in int[] is the Upgrade's base mineral cost. The second object is optional, and is only used if `Upg.levels` is more than one. This is the factor added to the base mineral cost for each level. For example, if the first level is researched, the cost is `mineralBaseCost`. When the second upgrade is researched, the mineral cost is `mineralBaseCost + levelFactor`. Level 3 mineral cost is equal to `mineralBaseCost + (levelFactor * 2)`
      * `Upg.gas = new int[]{gasBaseCost, levelFactor};`
        * This int[] stores information for gasCost. It acts the same as `Upg.minerals`.
      * Upg.time = new int[]{timeBase, levelFactor};
        * This int[] stores information for time acts the same as `Upg.minerals` and `Upg.gas`.
      * `Upg.levelReqs = new Object[]{new Level1Requirement(), new Level2Requirement(), new Level3Requirement()};`
        * This attribute is optional and is only necessary if `Upg.levels` is more than one.
      * `Upg.levels = numOfLevels;`
        * This attribute is optional and is only necessary if `Upg` has more than one level. If `Upg.levels` is not declared, it defaults to 1.
