package cr.ac.itcr.prueba;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class listaPaises extends ListFragment {

    // Array of strings storing country names
    String[] countries = new String[] {
            "Indian",
            "Pakistani",
            "Sri Lankan",
            "Renminbi",
            "Bangladeshi",
            "Nepalese",
            "Afghani",
            "North Korean",
            "South Korean",
            "Japan",
            "Italia",
            "Fracia",
            "Alemania",
            "Uruguay",
            "Guatemala",
            "Honduras",
            "Venezuela",
            "Canadá",
            "Australia",
            "Costa Rica"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.india,
            R.drawable.pakistan,
            R.drawable.srilanka,
            R.drawable.china,
            R.drawable.bangladesh,
            R.drawable.nepal,
            R.drawable.afghanistan,
            R.drawable.nkorea,
            R.drawable.skorea,
            R.drawable.japan,

            R.drawable.italia,
            R.drawable.francia,
            R.drawable.alemania,
            R.drawable.uruguay,
            R.drawable.guatemala,
            R.drawable.honduras,
            R.drawable.venezuela,
            R.drawable.canada,
            R.drawable.australia,
            R.drawable.costa_rica
    };

    // Array of strings to store currencies
    String[] currency = new String[]{
            "127,3 millones",
            "182,1 millones",
            "20,48 millones",
            " 8 millones",
            "156,6 millones",
            "27,8 millones ",
            "30,55 millones",
            "24,9 millones ",
            "50,22 millones ",
            "127,3 millones",
            "59,83 millones",
            "66,03 millones",
            "80,62 millones",
            "3,407 millones",
            "15,47 millones",
            "8,098 millones ",
            "30,41 millones",
            "35,16 millones",
            "23,13 millones",
            "4,872 millones"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<>();

        for(int i=0;i<20;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "País: " + countries[i]);
            hm.put("cur","Población:" + currency[i]);
            hm.put("flag", Integer.toString(flags[i]) );
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","txt","cur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt,R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.activity_listview_layout, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}