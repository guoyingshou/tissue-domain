package com.tissue.domain.social;

import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

public class TopicEvent extends Event {

     @Override
     public List getMessageArgs() {

         List args = new ArrayList();
         args.add(actor.getId());
         args.add(actor.getDisplayName());

         args.add(object.get("id"));
         args.add(object.get("title"));

         DateTime dt = new DateTime(published);
         DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
         args.add(dtf.print(dt));

         return args;
     }

}
