public class Circle {

        private double radius;
        private double x, y;

        public void setCentre (double x, double y){
            this.x = x;
            this.y = y;
        }

        public void setRadius (double radius){
            this.radius = radius;
        }

        double surface(){

            return Math.PI*Math.pow(radius,2);
        }

        boolean isInternal( double x, double y){
            double dx = Math.pow(x - this.x, 2);
            double dy = Math.pow(y - this.y, 2);
            if (dx + dy < Math.pow(radius, 2)){
                return true;
            }else{
                return false;
            }
        }


}
