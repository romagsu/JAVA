package by.gsu.pmslab;

    public enum Material {

        STEEL("steel",7850),COPPER("copper",8500);
        private String name;
        private double density;

        Material(String name, double density){
            this.name=name;
            this.density=density;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String toString() {
        return name + ";" + density;
    }
}

