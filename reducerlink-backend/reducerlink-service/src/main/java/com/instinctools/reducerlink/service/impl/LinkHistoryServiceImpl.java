package com.instinctools.reducerlink.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.instinctools.reducerlink.service.LinkHistoryService;
import com.instinctools.reducerlink.service.base.AuthorizedService;

@Service
@Transactional
public class LinkHistoryServiceImpl extends AuthorizedService implements LinkHistoryService {
}
