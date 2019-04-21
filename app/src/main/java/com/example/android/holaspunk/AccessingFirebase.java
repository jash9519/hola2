package com.example.android.holaspunk;

import android.location.Location;
import android.support.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AccessingFirebase
{
    DatabaseReference alluserdetails;

    AccessingFirebase()
    {
        alluserdetails=FirebaseDatabase.getInstance().getReference("alluserdetails");
    }

    public void addObjectToFirebase(final Users u)
    {
        alluserdetails.addValueEventListener(new ValueEventListener()
        {
            int counter=0,flag=1;
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot userincoating :dataSnapshot.getChildren())
                {
                    counter++;
                    Users user=userincoating.getValue(Users.class);
                    if( (user.getEmail()).equals(u.getEmail()) )
                    {
                        flag=0;
                        break;
                    }
                }

                if(flag==1)
                {
                    u.setCount(++counter);
                    String id = alluserdetails.push().getKey(); //This lets us make new user every time by generating new id each time
                    alluserdetails.child(id).setValue(u);

                    //TODO ??? toast that user added

                }
                else
                    //TODO  ??? toast that user not added
                    ;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }



    public void addLocationToFirebase(final Location loc)
    {
        FirebaseUser u=FirebaseAuth.getInstance().getCurrentUser();
        final String CurrentUserKaEmail=u.getEmail();

        alluserdetails.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot userincoating :dataSnapshot.getChildren())
                {
                    Users user=userincoating.getValue(Users.class);
                    if( (user.getEmail()).equals(CurrentUserKaEmail) )
                    {
                        DatabaseReference childRef=userincoating.getRef();
                        user.setlatlong(loc.getLatitude(),loc.getLongitude());
                        childRef.setValue(user);
                        break;
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public double[] getmydevicelocaton ()
    {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        final String CurrentUserKaEmail=user.getEmail();
        final double[] latlong = new double[2] ;

        alluserdetails.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot userincoating; dataSnapshot.getChildren())
                {
                    Users user = userincoating.getValue(Users.class);
                    if( (user.getEmail()).equals(CurrentUserKaEmail) )
                    {
                        DatabaseReference childref = userincoating.getRef();
                        latlong[0] = user.getLat() ;
                        latlong[1] = user.getLon() ;
                        childref.setValue(user) ;
                        break ;
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return latlong ;

    }
}
