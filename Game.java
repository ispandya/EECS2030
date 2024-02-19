package Lab5;

/**
 * This class implements a game like 'among us'
 *
 */
public class Game {
	private Player[] players;
    private Map map;

    // Default constructor
    public Game() {
        this.players = new Player[10];
        this.map = Map.getInstance();
    }

    // Overloaded constructor
    public Game(Player[] players, Map map) {
        this.players = players;
        this.map = map;
    }

    // Copy constructor
    public Game(Game game) {
        this.players = game.getPlayer();
        this.map = new Map(game.getMap()); // Deep copy of the map
    }

    // Static factory method to create an instance of Game
    public static Game getInstance() {
        return new Game();
    }

    // Static factory method to create an instance of Game with custom players and map
    public static Game getInstance(Player[] players, Map map) {
        return new Game(players, map);
    }

    // Static factory method to create a copy of an existing Game
    public static Game getInstance(Game game) {
        return new Game(game);
    }

    // Getter method for players
    public Player[] getPlayer() {
    	// Create a new array with the same length as players
        Player[] copy = new Player[players.length];
        // Copy each element from players to copy
        for (int i = 0; i < players.length; i++) {
            copy[i] = players[i];
        }
        // Return the copy of the players array
        return copy;
    }

    // Getter method for map
    public Map getMap() {
        return map;
    }

    // Setter method for players
    public void setPlayer(Player[] players) {
        this.players = players;
    }

    // Setter method for map
    public void setMap(Map map) {
        this.map = new Map(map);
    }
	
	/**
	 * This is the default constructors. 
	 * At most 10 player can play this game. 
	 */

	
	
	
	/**
	 * This is the overloaded constructor for this class
	 * @param player is an array containing all the players who entered the game.
	 * @param map is the area that is available to the players to play.
	 */
	

	
	
	
	/**
	 * This the copy constructor for this class
	 * @param game is an object of Game, whose component is deeply copied into 
	 * the component of this object.
	 */

	
	
	
	
	
	/**
	 * This is a static factory method
	 * @return IT returns an object of Game
	 */

	
	
	
	/**
	 * This is a static factory method
	 * @param player is an array that contains players.
	 * @param map is a map of the game
	 * @return It returns an object of Game made using the input parameters.
	 */

	
	
	
	/**
	 * This is a static factory method
	 * @param game is an object of Game
	 * @return it returns an object of Game made using the input parameter. 
	 */

	
	
	
	/**
	 * This is the getter method for the player list.
	 * @return returns an array containing all the players of this game. 
	 */

	
	
	
	/**
	 * This is the getter method for the map attribute.
	 * @return Returns an object of map containing all the components of this game's map.
	 */


	
	
	/**
	 * This is the setter method for the player attribute, which deeply copies 
	 * the input parameter into the player attribute of this object. 
	 * @param player is an array of Player, whose elements are copied in the player attribute of this object.
	 */
	

	
	
	/**
	 * This is the setter method for the map attribute, which deeply copies 
	 * the input parameter into the map attribute of this object.
	 * @param map is an object of Map, whose attributes are copied in the map attribute of this object.
	 */

	
} // end of class Game	
/**
 * 
 * This class implements all a player requires to play in this game. 
 *
 */
class Player {
	
	private String name;
	private Role role;
	// Default constructor
    public Player() {
        this("", new Role());
    }

    // Overloaded constructor
    public Player(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    // Static factory method to get an instance with default values
    public static Player getInstance() {
        return new Player();
    }

    // Static factory method to get an instance with specified values
    public static Player getInstance(String name, Role role) {
        return new Player(name, role);
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for role
    public Role getRole() {
        return role;
    }
	
	/**
	 * This is the overloaded constructor for this class
	 * @param name
	 * @param role
	 */

	
	
	/**
	 * This is the copy constructor for this class
	 * @param player
	 */

	
	
	
	/**
	 * This is a static factory method.
	 * @return It returns an object of Player
	 */

	
	
	/**
	 * This is a static factory method
	 * @param name is the name of player
	 * @param role is the role of the palyer in the game
	 * @return It returns an object of player, which is made by the two input variables. 
	 */

	
	
	
	/**
	 * This is a static factory method
	 * @param player is an object of player
	 * @return it returns an object of player that is made using the input parameter. 
	 */

	
	
	
	/**
	 * This is the getter method for attribute name
	 * @return returns the value of attribute name
	 */

	
	
	/**
	 * This is the getter method for attribute role
	 * @return returns the reference to attribute role.
	 */

	
	
	/**
	 * This is the setter method for attribute name
	 * @param name  is the value that is used to initialize name attribute
	 */

	
	
	/**
	 * This is the setter method for attribute role
	 * @param role is the object, whose reference is used to initialize attribute role.
	 */
	
} // end of class Player
/**
 * This class implements the areas in which players can play.
 *
 */
class Map{
	 String theSkeld;
     String miraHq;
     String polus;
     String airShip;

    // Overloaded constructor
    public Map(String theSkeld, String miraHq, String polus, String airShip) {
        this.theSkeld = theSkeld;
        this.miraHq = miraHq;
        this.polus = polus;
        this.airShip = airShip;
    }

    // Static factory method to create an instance of Map with default values
    public static Map getInstance() {
        return new Map("", "", "", "");
    }

    // Static factory method to create an instance of Map with custom values
    public static Map getInstance(String theSkeld, String miraHq, String polus, String airShip) {
        return new Map(theSkeld, miraHq, polus, airShip);
    }

    // Copy constructor
    public Map(Map map) {
        this.theSkeld = map.getTheSkeld();
        this.miraHq = map.getMiraHq();
        this.polus = map.getPolus();
        this.airShip = map.getAirShip();
    }

    // Getter methods for map areas
    public String getTheSkeld() {
        return theSkeld;
    }

    public String getMiraHq() {
        return miraHq;
    }

    public String getPolus() {
        return polus;
    }

    public String getAirShip() {
        return airShip;
    }

    // Setter methods for map areas (not explicitly mentioned in the documentation)
    public void setTheSkeld(String theSkeld) {
        this.theSkeld = theSkeld;
    }

    public void setMiraHq(String miraHq) {
        this.miraHq = miraHq;
    }

    public void setPolus(String polus) {
        this.polus = polus;
    }

    public void setAirShip(String airShip) {
        this.airShip = airShip;
    }
//////
//    // Static factory method to get an instance with specified values
//    public static Map getInstance(String theSkeld, String miraHq, String polus, String airShip) {
//        return new Map(theSkeld, miraHq, polus, airShip);
//    }


	
	
	/**
	 * This is the overloaded constructor.
	 * @param theSkeld is the first area in which player can play.
	 * @param miraHq is the second area in which player can play.
	 * @param polus is the third area in which player can play.
	 * @param airShip  is the fourth area in which player can play.
	 */

	
	
	/**
	 * This is a static factory method that initializes the attributes to their default values. 
	 * @return It returns an object of MAP
	 */

	
	
	/**
	 * This is a static factory method
	 * @param theSkeld is the first area in which player can play.
	 * @param miraHq is the second area in which player can play.
	 * @param polus is the third area in which player can play.
	 * @param airShip  is the fourth area in which player can play.
	 * @return it returns an object of MAP.
	 */

	
	
	/**
	 * This is the copy constructor.
	 * @param map is an object of Map that is used to initialize this object.
	 */

	
	
	/**
	 * This is a static factory method. 
	 * @param map is an object of Map
	 * @returnIt returns an object of Map
	 */

} // end of class Map



/**
 * 
 * This class presents the role of the players, 
 * which can be either imposter or crewmate. 
 *  Imposter role, gets the value of 'i'and 
 *  Cremate gets the value of 'c'
 *
 */
class Role{
	char role;

    // Default constructor
    public Role() {
        role = ' ';
    }

    // Overloaded constructor
    public Role(char role) {
        this.role = role;
    }

    // Static factory method to get an instance with default role
    public static Role getInstance() {
        return new Role();
    }

    // Static factory method to get an instance with a specified role
    public static Role getInstance(char role) {
        return new Role(role);
    }

    // Getter method for role
    public char getRole() {
        return role;
    }

	
	
	/**
	 * This is the overloaded constructor.
	 * @param role is used as an initial value of the instance variable role
	 */

	
	/**
	 * This is a static factory method.
	 * @return it returns a reference to an object that is created in this factory method.
	 */

	
	
	/**
	 * This is a static factory method.
	 * @param role is the initial value of the role
	 * @return it returns a reference to an object that is created in this factory method.
	 */

	
	/**
	 * This is the copy constructor. 
	 * @param role is an object of Role that is used to initialize the instance variable role.
	 */

	
	
	/**
	 * This is a static factory method
	 * @param role is a variable of type Role
	 * @return it returns an object of Role.
	 */

	
	/**
	 * This is the getter method for the role
	 * @return It returns the role of the player
	 */

	
	
	/**
	 * This is the setter method for the role
	 * @param role is the initial value for attribute role
	 */
	
} // end of class Role
