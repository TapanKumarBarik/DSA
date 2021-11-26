
HLD - Sharding 1
If you want to store a large amount of data which cannot fit in a single machine, which option will you choose (Assuming you have n servers, and you want the flexibility of adding and/or removing servers):




    Store as much data as possible in 1 server, if that fills up, add 1 more server to the cluster. Keep information about on which server a particular record is stored in a separate server.
    Use hashing : server_number = (hash_code(shard_key) % n
    Break the application into smaller services so that now data can fit into a single database instance
    place all servers on a 360 degree ring and server_number = clockwise((hash_code(shard_key) % 360)

Expected Answer: place all servers on a 360 degree ring and server_number = clockwise((hash_code(shard_key) % 360)
