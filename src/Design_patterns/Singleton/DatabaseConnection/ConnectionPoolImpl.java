package Design_patterns.Singleton.DatabaseConnection;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;

    public class ConnectionPoolImpl  implements ConnectionPool{

        private static ConnectionPoolImpl instance;
        private int maxConnection;
        Queue<DatabaseConnection> availableConnection = new LinkedList<DatabaseConnection>();
        Set<DatabaseConnection> usedConnection = new HashSet<DatabaseConnection>();

        private ConnectionPoolImpl(int maxConnection){
            this.maxConnection = maxConnection;
        }

        public static ConnectionPoolImpl getInstance(int maxConnection){
            if(instance == null){
                synchronized(ConnectionPoolImpl.class){
                    if(instance == null){
                        instance = new ConnectionPoolImpl(maxConnection);
                        instance.initializePool();
                    }
                }
            }
            return instance;
        }

        public static void resetInstance(){
            instance = null;
        }


        @Override
        public void initializePool() {

            availableConnection.clear();
            usedConnection.clear();

            for (int i = 0; i < maxConnection; i++) {
                availableConnection.offer(new DatabaseConnection());
            }

        }

        @Override
        public DatabaseConnection getConnection() {
            DatabaseConnection connection = availableConnection.poll();

            if (connection != null) {
                usedConnection.add(connection);
            }

            return connection;
        }

        @Override
        public void releaseConnection(DatabaseConnection connection) {
            if (connection != null && usedConnection.remove(connection)) {
                availableConnection.offer(connection);
            }
        }

        @Override
        public int getAvailableConnectionsCount() {

            return availableConnection.size();
        }

        @Override
        public int getTotalConnectionsCount() {

            return maxConnection;
        }
    }

