HLD - Cache 1
In order to have maximum consistency using a database and a cache we must use cache in:

    Write to cache and periodically write to DB to save on DB calls
    Write to DB only
    Write to cache and DB both, if either of them fails, send error to the client
    Write to DB and periodically write to cache to save on latency
    
    
        Write to cache and DB both, if either of them fails, send error to the client
