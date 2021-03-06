import com.qualcomm.robotcore.hardware.DcMotor;

public class YourClassName extends OpMode {
 
    DcMotor arm_motor;
    public void init() {
      arm_motor = hardwareMap.dcMotor.get("arm");
      arm_motor.setDirection(DcMotor.Direction.REVERSE);
      arm_motor.setPower(-0.75);
      int position = arm_motor.getCurrentPosition();
      telemetry.addData("Encoder Position", position);
      arm_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      arm_motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
    public void loop() {
      float left_front_power = gamepad1.left_stick_y;
      float right_front_power = -1 * gamepad1.left_stick_x;
      float left_back_power = gamepad1.left_stick_y;
      left_drive.setPower(left_power);
      right_drive.setPower(right_power);
    }
}
