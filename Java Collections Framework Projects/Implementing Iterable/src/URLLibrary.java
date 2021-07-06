import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class URLLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<>();

    public URLLibrary(String[] urls) {
        this.urls.addAll(Arrays.asList(urls));
    }

    private class URLIterator implements Iterator<String> {     // #2.
        private int nextIndex = 0;                              // #2.1

        @Override
        public boolean hasNext() {                              // #2.2
            return nextIndex < urls.size();
        }

        @Override
        public String next() {                                  // #2.3
            StringBuilder content = new StringBuilder("");
            try {
                URL url = new URL(urls.get(nextIndex));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;
                while ((line = br.readLine()) != null) {
                    content.append(line);
                    content.append("\n");
                }
                br.close();

            } catch (Exception e) {
                System.out.println("Unable to read the URL.");
            }

            nextIndex++;
            return content.toString();
        }

        @Override
        public void remove() {                                  // #2.4
            if (nextIndex < urls.size()) {
                urls.remove(nextIndex);
            }
        }
    }

    @Override
    public Iterator<String> iterator() {
        //return urls.iterator()                                 // First way: #1.
        return new URLIterator();
    }
}



/*
 * To make your class iterable, just implement the Iterable interface and its method iterator().
 *  #1.
 *     iterator(): This method returns Iterator object. We have to implement this in such a way that it can be
 *     capable of returning next element and keeping track of current element.
 *     Easiest way to do so it just return iterator of your primary object (here array urls).
 *              -- return new urls.iterator().
 *
 *  #2.
 *     Second way is to create your own iterator inside your main class which can be done using inner classes.
 *     To do so, create an inner class and implement Iterator<T>, T is the same type as primary structure,
 *     and then use object of this inner class inside the iterator() method of main class which was requiring the same.
 *  #2.1
 *     nextIndex is a pointer we require to keep track of next element.
 *  #2.2
 *     hasNext() returns true if next element is present, else false.
 *  #2.3
 *     next() returns the element pointed by nextIndex, throws exception if not present.
 *     We can also provide implementation code if we want to do any other processing.
 *     Like here we'll gonna be displaying content of the URL using BufferedReader and InputStreamReader.
 *  #2.4
 *     remove() returns the element pointed by nextIndex.
 *  We have to provide the implementation using above contract, which is not very difficult :)
 *
 * ------------------------------
 *  So the key point is, you have to implement Iterable interface in order to make a class iterable, which just have
 *  one method iterator(). This iterator() methods returns object of Iterator interface. So you have two choices...
 *  Either return the iterator of the primary data structure (here urls List), or implement your own using inner class.
 */