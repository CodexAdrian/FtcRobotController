package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.FORWARD
import com.qualcomm.robotcore.hardware.HardwareMap

open class RegisLinearOp : LinearOpMode() {
    protected lateinit var rightFrontMotor : DcMotor
    protected lateinit var rightBackMotor : DcMotor
    protected lateinit var leftFrontMotor : DcMotor
    protected lateinit var leftBackMotor : DcMotor
    protected lateinit var duckMotor : DcMotor
    protected lateinit var intakeMotor : DcMotor

    private inline fun <reified T> HardwareMap.getType(name: String) = get(T::class.java, name)

    override fun runOpMode() {
        rightFrontMotor = hardwareMap.getType("Top Right")
        rightBackMotor = hardwareMap.getType("Bottom Right")
        leftFrontMotor = hardwareMap.getType("Top Left")
        leftBackMotor = hardwareMap.getType("Bottom Left")
        duckMotor = hardwareMap.getType("Duck Motor")
        intakeMotor = hardwareMap.getType("Intake Motor")
        rightFrontMotor.direction = REVERSE
        rightBackMotor.direction = REVERSE
        leftFrontMotor.direction = FORWARD
        leftBackMotor.direction = FORWARD
        duckMotor.direction = FORWARD
        intakeMotor.direction = FORWARD

        telemetry.addData("Status", "Initialized")
        telemetry.update()
        waitForStart()
    }
}
