| Method                  | Purpose               |
| ----------------------- | --------------------- |
| lock()                  | Acquire lock          |
| unlock()                | Release lock          |
| tryLock()               | Try immediately       |
| tryLock(timeout)        | Try with waiting time |
| lockInterruptibly()     | Interruptible lock    |
| isLocked()              | Check if locked       |
| isHeldByCurrentThread() | Check ownership       |
| getHoldCount()          | Reentrance count      |
| newCondition()          | Thread coordination   |


🎯 Interview Perfect Answer

If asked:

What are important methods of ReentrantLock?

You say:

ReentrantLock provides methods like lock(), unlock(), tryLock(), tryLock with timeout, lockInterruptibly(), and condition support through newCondition(). It also provides monitoring methods like isLocked() and getHoldCount(). These features make it more flexible than synchronized.