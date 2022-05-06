public class Quiz2 {
    public class Hero {
        private String name;
        private int powerLevel;
    
        public Hero(String name, int powerLevel)
        {
        this.name = name;
        this.powerLevel = powerLevel;
        }
    
        // override the Object equals method below
        // checking all the data
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
        } else if (this.getClass() != obj.getClass()) {
                return false;
        } else {
                Hero other = (Hero) obj;
                return this.name.equals(other.name) && this.powerLevel == other.powerLevel;
        }


    }

    public class Utility
    {
        public static void bumpGPA(Student s, double bump)
        {
            s.gpa += bump;
        }
    }

    public class Student {

        public void bumpGPA(double bump)
        {
            this.gpa += bump;
        }
    }

    s.bumpGPA(1.0);
}