package add.border;

public class AddBorder {

        /**
         * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
         *
         *  picture =    ["abc",
         *                "ded"]
         *
         *
         *  addBorder(picture) = ["*****",
         *                        "*abc*",
         *                        "*ded*",
         *                        "*****"]
         */
        public String[] addBorder(String[] picture) {
            int length = picture.length;
            int asteriks = picture[0].length();
            int totalSpace = asteriks + 2;
            String[] output = new String[length + 2];
            String border = "";
            for(int i =0; i < totalSpace; i++){
                border+="*";
            }

            output[0] = border;
            for(int i =0; i < picture.length; i++){
                int j = i + 1;
                output[j] = "*" + picture[i] + "*";
            }

            int last = length + 1;
            output[last] = border;

            return output;
        }

}
