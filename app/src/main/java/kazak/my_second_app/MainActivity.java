package kazak.my_second_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        int[] array = {1,5,4,13,8,9};
        int index = 2;

        sortFromSmallestToLargest(array);

        int i =0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        System.out.println();
        System.out.println(numberReterner(array, index));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logOutOurName();

    }

    public void logOutOurName() {
        Log.d("Key", "Android");
    }

    public static void sortFromSmallestToLargest(int[] array) {
        for (int i = array.length-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temporaryNumber = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporaryNumber;
                }
            }
        }
    }

    public static int numberReterner (int array[], int index) {
        return array[index];
    }
}