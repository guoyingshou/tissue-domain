package com.tissue.domain.social;

import java.util.List;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

public class MemberEvent extends Event {

     @Override
     public List getMessageArgs() {
         List args = new ArrayList();
         /**
         args.add(actor.getId());
         args.add(actor.getDisplayName());

         args.add(target.getId());
         args.add(target.getTitle());

         DateTime dt = new DateTime(published);
         DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
         args.add(dtf.print(dt));
         */

         return args;
     }

}
