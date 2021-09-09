package Class17.LabSession;

public class Lab2 {
    public static void main(String[] args) {

        /**
         *  String[] words = {"happy", "peaceful", "growing mindset", "skills to learn"};
         *
         *  find the word which contains H or P
         *
         *  String letterH = "H";
         *  String letterP = "P";
         *
         *  "happy" <- words[0]
         *  does "happy" contain H? (ignoring case)
         *      OR
         *  does "happy" contain P? (ignoring case)<- words[0].toLowercase().contains(letterH.toLowercase())
         *
         *  boolean isContainH = words[0].toLowercase().contains(letterH.toLowercase())
         *  boolean isContainP = words[0].toLowercase().contains(letterP.toLowercase())
         *  if (isContainH || isContainP)
         *      sout("happy");      <- sout(words[0]);
         *
         *  "peaceful"
         *  does "peaceful" contain H? (ignoring case)
         *  if (yes)
         *      sout("peaceful");
         *
         *  "happy" <- words[1]
         *  does "happy" contain H? (ignoring case)   <- words[1].toLowercase().contains(letterH.toLowercase())
         *  boolean isContainH = words[1].toLowercase().contains(letterH.toLowercase())
         *  if (isContainH)
         *      sout("happy");      <- sout(words[1]);
         *
         *
         *  "growing mindset"
         *  does "growing mindset" contain H? (ignoring case)
         *  if (yes)
         *      sout("growing mindset");
         *
         *  "skills to learn"
         *  does "skills to learn" contain H? (ignoring case)
         *  if (yes)
         *      sout("skills to learn");
         *
         *
         */

        /*
                String[] words = {"happy", "peaceful", "growing mindset", "skills to learn"};

                words[0]
                boolean isContainH = words[0].toLowercase().contains(letterH.toLowercase())
                if (isContainH)
                    sout(words[0]);

                words[1]
                boolean isContainH = words[1].toLowercase().contains(letterH.toLowercase())
                if (isContainH)
                    sout(words[1]);

                words[2]
                boolean isContainH = words[2].toLowercase().contains(letterH.toLowercase())
                if (isContainH)
                    sout(words[2]);

                words[3]    // lastIndex
                boolean isContainH = words[3].toLowercase().contains(letterH.toLowercase())
                if (isContainH)
                    sout(words[3]);



                words[i]    // i=0,1,2,3 ( i < length )   i++
                boolean isContainH = words[i].toLowercase().contains(letterH.toLowercase())
                if (isContainH)
                    sout(words[i]);

                for (int i=0 ; i < words.length ; i++) {
                    words[i]
                    boolean isContainH = words[i].toLowercase().contains(letterH.toLowercase())
                    if (isContainH)
                        sout(words[i]);
                }



         */


    }
}
