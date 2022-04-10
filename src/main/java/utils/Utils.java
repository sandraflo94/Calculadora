package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Utils {

    static public String readLineFromConsole(String strPrompt) {
        try {
            System.out.println(strPrompt);

            InputStreamReader converter = new InputStreamReader(System.in); //lê do teclado
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        /* este não está a ser utilizado, certo?
        static public Date readDateFromConsole(String strPrompt)
        {
            do
            {
                try
                {
                    String strDate = readLineFromConsole(strPrompt);

                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                    Date date = df.parse(strDate);

                    return date;
                } catch (ParseException ex)
                {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (true);
        }*/

    static public boolean confirma(String sMessage) {
        String strConfirma;
        do {
            strConfirma = Utils.readLineFromConsole("\n" + sMessage + "\n");
        } while (!strConfirma.equalsIgnoreCase("s") && !strConfirma.equalsIgnoreCase("n"));

        return strConfirma.equalsIgnoreCase("s");
    }

    static public Object apresentaESeleciona(List list, String sHeader) {
        apresentaLista(list, sHeader);
        System.out.println("0 - Cancelar");
        return selecionaObject(list);
    }

    static public void apresentaLista(List list, String sHeader) {
        System.out.println(sHeader);

        int index = 0;
        for (Object o : list) {
            index++;

            System.out.println(index + ". " + o.toString());
        }
    }

    static public Object selecionaObject(List list) {
        String opcao;
        int nOpcao;
        do {
            opcao = Utils.readLineFromConsole("Introduza opção: ");
            nOpcao = Integer.parseInt(opcao);
        } while (nOpcao < 0 || nOpcao > list.size());

        if (nOpcao == 0) {
            return null;
        } else {
            return list.get(nOpcao - 1);
        }
    }


}
