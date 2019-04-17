import java.util.ArrayList;

public interface Sort {

    public final String[][] dependencies = {{ "A" , "B" },  { "B", "C" },   { "B", "C" }, {"D", "E"}};

    public boolean isWellSorted(String[] sequence);

}

class Test implements Sort {

    public  boolean isWellSorted(String[] sequence) {

        ArrayList a = new ArrayList();

        boolean hasAppearedAlready = true;

        if(sequence!=null) {

            for (int i = 0; i < sequence.length; i++) {


                for (int j = 0; j < dependencies.length; j++) {

                    if (dependencies[j][1].equals(sequence[i]))
                        a.add(new Integer(j)); //mark index where dependency exist


                }


                for (int j = 0; j < a.size(); j++) {

                    hasAppearedAlready = false;

                    int index = Integer.parseInt(a.get(j).toString());
                    System.out.println(i + "need an " + dependencies[index][0]);

                    for (int k = 0; k < i; k++) { //for all chars so far


                        System.out.println("seq has " + sequence[k] + k + "" + j);

                        if (sequence[k].equals(dependencies[index][0])) {
                            System.out.println("found previous " + dependencies[index][0]);
                            hasAppearedAlready = true;
                            break;
                        }
                    }

                    System.out.println("oi");

                    if (!hasAppearedAlready) {
                        return false;
                    }


                }
            }

            System.out.println(a);


            return hasAppearedAlready;
        }

        return true;
    }


}

