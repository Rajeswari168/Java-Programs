import java.util.*;
class Customer{
    int cust_id;
    String name;
    String phone;
    String email;
    String address;
    Customer(int cust_id,String name,String phone,String email,String address){
        this.cust_id=cust_id;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }
}
class Shipment{
    int shipment_id;
    String tracking_id;
    String sender_address;
    String receiver_address;
    String shipment_date;
    String delivery_date;
    String status;
    int cust_id;
    Shipment(int shipment_id,String tracking_id,String sender_address,String receiver_address,String shipment_date,String delivery_date,String status,int customer_id){
        this.shipment_id=shipment_id;
        this.tracking_id=tracking_id;
        this.sender_address=sender_address;
        this.receiver_address=receiver_address;
        this.shipment_date=shipment_date;
        this.delivery_date=delivery_date;
        this.status=status;
        this.cust_id=cust_id;
    }
}
class Package{
    int package_id;
    double weight;
    String dimensions;
    String description;
    int shipment_id;
    Package(int package_id,double weight,String dimensions,String description,int shipment_id){
        this.package_id=package_id;
        this.weight=weight;
        this.dimensions=dimensions;
        this.description=description;
        this.shipment_id=shipment_id;
    }
}
class Warehouse{
    int warehouse_id;
    String name;
    String location;
    String contact_no;
    Warehouse(int warehouse_id,String name,String location,String contact_no){
        this.warehouse_id=warehouse_id;
        this.name=name;
        this.location=location;
        this.contact_no=contact_no;
    }
}
class DeliveryAgent{
    int agent_id;
    String name;
    String phone;
    String vehicle_no;
    DeliveryAgent(int agent_id,String name,String phone,String vehicle_no){
        this.agent_id=agent_id;
        this.name=name;
        this.phone=phone;
        this.vehicle_no=vehicle_no;
    }
}
class TrackingEvent{
    int event_id;
    String event_time;
    String location;
    String status;
    String remarks;
    int shipment_id;
    TrackingEvent(int event_id,String event_time,String location,String status,String remarks,int shipment_id){
        this.event_id=event_id;
        this.event_time=event_time;
        this.location=location;
        this.status=status;
        this.remarks=remarks;
        this.shipment_id=shipment_id;
    }
}
class Assignment{
    int assignment_id;
    String assigned_date;
    String delivery_status;
    int shipment_id;
    int agent_id;
    Assignment(int assignment_id,String assigned_date,String delivery_status,int shipment_id,int agent_id){
        this.assignment_id=assignment_id;
        this.assigned_date=assigned_date;
        this.delivery_status=delivery_status;
        this.shipment_id=shipment_id;
        this.agent_id=agent_id;
    }
}
class ShipmentWarehouse{
    int id;
    String arrival_time;
    String departure_time;
    int shipment_id;
    int warehouse_id;
    ShipmentWarehouse(int id,String arrival_time,String departure_time,int shipment_id,int warehouse_id){
        this.id=id;
        this.arrival_time=arrival_time;
        this.departure_time=departure_time;
        this.shipment_id=shipment_id;
        this.warehouse_id=warehouse_id;
    }
} 
public class Delivery{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Customer> customers=new ArrayList<>();
        ArrayList<Shipment> shipments=new ArrayList<>();
        ArrayList<Package> packages=new ArrayList<>();
        ArrayList<Warehouse> warehouses=new ArrayList<>();
        ArrayList<DeliveryAgent> agents=new ArrayList<>();
        ArrayList<TrackingEvent> events=new ArrayList<>();
        ArrayList<Assignment> assignments=new ArrayList<>();
        ArrayList<ShipmentWarehouse> swlist=new ArrayList<>();
        System.out.println("1 Customer");
        System.out.println("2 Shipment");
        System.out.println("3 Package");
        System.out.println("4 Warehouse");
        System.out.println("5 Delivery Agent");
        System.out.println("6 Tracking Event");
        System.out.println("7 Assignment");
        System.out.println("8 Shipment Warehouse");
        System.out.println("9 Display");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                int cid=sc.nextInt();
                String cname=sc.next();
                String cphone=sc.next();
                String cemail=sc.next();
                String caddress=sc.next();
                Customer cust=new Customer(cid,cname,cphone,cemail,caddress);
                customers.add(cust);
                break;
            case 2:
                int sid=sc.nextInt();
                String tid=sc.next();
                String saddr=sc.next();
                String raddr=sc.next();
                String sdate=sc.next();
                String ddate=sc.next();
                String status=sc.next();
                int csid=sc.nextInt();
                Shipment ship=new Shipment(sid,tid,saddr,raddr,sdate,ddate,status,csid);
                shipments.add(ship);
                break;
            case 3:
                int pid=sc.nextInt();
                double weight=sc.nextDouble();
                String dim=sc.next();
                String desc=sc.next();
                int spid=sc.nextInt();
                Package pack=new Package(pid,weight,dim,desc,spid);
                packages.add(pack);
                break;
            case 4:
                int wid=sc.nextInt();
                String wname=sc.next();
                String wloc=sc.next();
                String wphone=sc.next();
                Warehouse ware=new Warehouse(wid,wname,wloc,wphone);
                warehouses.add(ware);
                break;
            case 5:
                int aid=sc.nextInt();
                String aname=sc.next();
                String aphone=sc.next();
                String vehicle=sc.next();
                DeliveryAgent agent=new DeliveryAgent(aid,aname,aphone,vehicle);
                agents.add(agent);
                break;
            case 6:
                int eid=sc.nextInt();
                String etime=sc.next();
                String eloc=sc.next();
                String estat=sc.next();
                String remark=sc.next();
                int eship=sc.nextInt();
                TrackingEvent event=new TrackingEvent(eid,etime,eloc,estat,remark,eship);
                events.add(event);
                break;
            case 7:
                int asid=sc.nextInt();
                String adate=sc.next();
                String dstatus=sc.next();
                int aship=sc.nextInt();
                int aagent=sc.nextInt();
                Assignment assign=new Assignment(asid,adate,dstatus,aship,aagent);
                assignments.add(assign);
                break;
            case 8:
                int id=sc.nextInt();
                String arrival_time=sc.next();
                String departure_time=sc.next();
                int shipment_id=sc.nextInt();
                int warehouse_id=sc.nextInt();
                ShipmentWarehouse sw=new ShipmentWarehouse(id,arrival_time,departure_time,shipment_id,warehouse_id);
                swlist.add(sw);
                break;
            case 9:
                for(Customer c:customers)
                    System.out.println(c.cust_id+" "+c.name);
                for(Shipment s:shipments)
                    System.out.println(s.shipment_id+" "+s.status);
                for(Package p:packages)
                    System.out.println(p.package_id+" "+p.weight);
                for(Warehouse w:warehouses)
                    System.out.println(w.warehouse_id+" "+w.name);
                for(DeliveryAgent a:agents)
                    System.out.println(a.agent_id+" "+a.name);
                for(TrackingEvent e:events)
                    System.out.println(e.event_id+" "+e.status);
                for(Assignment a1:assignments)
                    System.out.println(a1.assignment_id+" "+a1.delivery_status);
                for(ShipmentWarehouse s1:swlist)
                    System.out.println(s1.id+" "+s1.arrival_time);
                break;
        }
    }
}