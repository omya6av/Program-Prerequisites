class VolumeOfEarth {
    public static void main(String[] args) {
	
        // Radius of Earth in kilometers
        double radiusInKm = 6378;

        // Conversion factor
        double kmToMiles = 0.621371;

        // Formula for volume of a sphere
        double volumeInKm = (4/ 3) * Math.PI * Math.pow(radiusInKm, 3);

        // Convert the radius to miles
        double radiusMiles = radiusInKm * kmToMiles;

        // Calculate the volume in cubic miles
        double volumeMiles = (4/ 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Display the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKm + " and in cubic miles is " + volumeMiles);
    }
}
