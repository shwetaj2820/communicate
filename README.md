# communicate
**Communication protocol built over TCP** 

This is a networking project that explores how communication protocols work beneath the application layer. The goal is to implement the components of a reliable communication protocol from the first principles of Java; relying only on the socket API for network transport. 

**Milestone-1  - Basic Client-Server communication:**

Implemented:
- TCP Client and Server using Java sockets
- Request-response communication model
- Persistent client session
- Graceful connection termination

**Roadmap:**
- [x] Basic TCP Cilent server communication
- [ ] Custom binary frame format
- [ ] Manual serialization and deserialization
- [ ] CRC implementation
- [ ] Error injection (bit corruption)
- [ ] Configurable channel simulator
- [ ] Acknowledgements and retransmissions
- [ ] Sequence numbers and reliable delivery
- [ ] Multi client server support
- [ ] File transfer over custom protocol
- [ ] Optional compression and encryption modules
- [ ] Protocol analyzer and statistics dashboard
