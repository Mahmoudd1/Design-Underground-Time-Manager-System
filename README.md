# Underground-Time-Manager-System-Design
This is a Java implementation of the UndergroundSystem class that manages the check-in and check-out process of customers in an underground transportation system. It also provides a method to calculate the average travel time between two stations.
## Implementation Details
The UndergroundSystem class is implemented using the following data structures:

- usersMap: A HashMap that stores the check-in time of each customer, mapped by their ID.
- stationsMap: A HashMap that stores the travel times between different station pairs. The key is a combination of the start station and end station, and the value is a list of travel times.
- userStation: A HashMap that stores the current station of each customer, mapped by their ID.
## Methods
**The checkIn() method**:

Stores the check-in time of the customer in the usersMap and the current station in the userStation HashMap.

**The checkOut() method**:

Calculates the travel time by subtracting the check-in time from the check-out time.
Adds the travel time to the corresponding station pair in the stationsMap.

**The getAverageTime() method**:

Retrieves the list of travel times for the given start and end station from the stationsMap.
Calculates the average travel time by summing all travel times and dividing by the number of times.

## Usage
To use the UndergroundSystem class, follow the steps below:

Create an instance of the UndergroundSystem class:

```java
UndergroundSystem undergroundSystem = new UndergroundSystem();
Call the checkIn() method when a customer checks in at a station:
```
```java
undergroundSystem.checkIn(id, stationName, t);
Call the checkOut() method when a customer checks out at a station:
```
```java
undergroundSystem.checkOut(id, stationName, t);
Call the getAverageTime() method to retrieve the average travel time between two stations:
```
```java
double averageTime = undergroundSystem.getAverageTime(startStation, endStation
```
## Complexity Analysis
The time and space complexity of the implemented methods are as follows:

The checkIn() method has a time complexity of O(1) since it involves inserting elements into HashMaps.
The checkOut() method has a time complexity of O(1) since it involves inserting elements into HashMaps and accessing lists in the stationsMap.
The getAverageTime() method has a time complexity of O(k), where k is the number of travel times for the given station pair.
The space complexity of the UndergroundSystem class is O(n), where n is the number of unique customers and unique station pairs.
