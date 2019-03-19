import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class WordCountReducer extends Reducer<Text, Iterable<IntWritable>,Text,IntWritable> {
    public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
        int sum=0;
        IntWritable value=new IntWritable();
        for (IntWritable val:values){
            sum+=val.get();
        }
        value.set(sum);
        context.write(key, value);

    }
}
