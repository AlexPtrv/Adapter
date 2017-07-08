/**
 * Created by Alex on 08.07.2017.
 */
public class ChooseAdapter extends DriveBoard implements Boards{
    @Override
    public void skateboard() {
        driveSkateboard();
    }

    @Override
    public void longboard() {
driveLongboard();
    }

    @Override
    public void snowboard() {
driveSnowboard();
    }

    @Override
    public void pennyboard() {
drivePennyboard();
    }
}
