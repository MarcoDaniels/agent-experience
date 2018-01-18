# agent-experience

_agent-experience is the agent responsible for retrieving all work experience information to the operator_

## routes
```
/agent/experience/,
/agent/experience/{name},
/agent/help
/agent/wakeup,
```

agent-experience is part of [my little virtual friend](http://mylittlevirtualfriend.com) setup.

## todo
- [ ] repository in model to get experience(s) with interfaces
- [ ] agent controller using repository 
- [ ] agent/help endpoint
- [ ] agent/wakeup endpoint
- [ ] setup authentication for post/put/delete endpoints
- [ ] post/put/delete endpoints
- [ ] setup a database instead of inMemory?