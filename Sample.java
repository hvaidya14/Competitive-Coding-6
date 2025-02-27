
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Logger {
    Map<String, Integer> m;
    public Logger() {
        m = new HashMap<>();
    }
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (m.containsKey(message)) {
            int printtime = m.get(message)+10;
            if(timestamp < printtime) {
                return false;
            }
            m.put(message, timestamp);
            return true;
        } else {
            m.put(message, timestamp);
            return true;
        }
        
    }
}
/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
