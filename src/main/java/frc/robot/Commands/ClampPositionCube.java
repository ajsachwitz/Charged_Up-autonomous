package frc.robot.Commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Subsystems.Arm;

public class ClampPositionCube extends CommandBase{
    public final Arm arm;
    public ClampPositionCube(Arm arm){
        this.arm = arm;
    }
    public void execute() {
        arm.clampRightPID.setP(.5);
        arm.clampLeftPID.setP(.5);
        arm.clampInPositionCube();
    }
    public boolean isFinished() {
        return arm.nearTarget(Constants.armConstants.clampRightPickupCube);
      }
}
