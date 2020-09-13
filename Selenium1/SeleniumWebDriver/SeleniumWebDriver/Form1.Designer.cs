namespace SeleniumWebDriver
{
    partial class Form1
    {
        /// <summary>
        /// Обязательная переменная конструктора.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Освободить все используемые ресурсы.
        /// </summary>
        /// <param name="disposing">истинно, если управляемый ресурс должен быть удален; иначе ложно.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Код, автоматически созданный конструктором форм Windows

        /// <summary>
        /// Требуемый метод для поддержки конструктора — не изменяйте 
        /// содержимое этого метода с помощью редактора кода.
        /// </summary>
        private void InitializeComponent()
        {
            this.StartFirstTestButtonClick = new System.Windows.Forms.Button();
            this.StopFirstTestButton = new System.Windows.Forms.Button();
            this.StartSecondTestButton = new System.Windows.Forms.Button();
            this.StopSecondTestButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // StartFirstTestButtonClick
            // 
            this.StartFirstTestButtonClick.Location = new System.Drawing.Point(104, 122);
            this.StartFirstTestButtonClick.Name = "StartFirstTestButtonClick";
            this.StartFirstTestButtonClick.Size = new System.Drawing.Size(160, 88);
            this.StartFirstTestButtonClick.TabIndex = 0;
            this.StartFirstTestButtonClick.Text = "Test1";
            this.StartFirstTestButtonClick.UseVisualStyleBackColor = true;
            this.StartFirstTestButtonClick.Click += new System.EventHandler(this.StartFirstTestButtonClick_Click);
            // 
            // StopFirstTestButton
            // 
            this.StopFirstTestButton.Location = new System.Drawing.Point(104, 247);
            this.StopFirstTestButton.Name = "StopFirstTestButton";
            this.StopFirstTestButton.Size = new System.Drawing.Size(160, 94);
            this.StopFirstTestButton.TabIndex = 1;
            this.StopFirstTestButton.Text = "StopTest1";
            this.StopFirstTestButton.UseVisualStyleBackColor = true;
            this.StopFirstTestButton.Click += new System.EventHandler(this.StopFirstTestButton_Click);
            // 
            // StartSecondTestButton
            // 
            this.StartSecondTestButton.Location = new System.Drawing.Point(307, 122);
            this.StartSecondTestButton.Name = "StartSecondTestButton";
            this.StartSecondTestButton.Size = new System.Drawing.Size(165, 88);
            this.StartSecondTestButton.TabIndex = 2;
            this.StartSecondTestButton.Text = "Test2";
            this.StartSecondTestButton.UseVisualStyleBackColor = true;
            this.StartSecondTestButton.Click += new System.EventHandler(this.StartSecondTestButton_Click);
            // 
            // StopSecondTestButton
            // 
            this.StopSecondTestButton.Location = new System.Drawing.Point(307, 247);
            this.StopSecondTestButton.Name = "StopSecondTestButton";
            this.StopSecondTestButton.Size = new System.Drawing.Size(160, 94);
            this.StopSecondTestButton.TabIndex = 3;
            this.StopSecondTestButton.Text = "StopTest2";
            this.StopSecondTestButton.UseVisualStyleBackColor = true;
            this.StopSecondTestButton.Click += new System.EventHandler(this.StopSecondTestButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.StopSecondTestButton);
            this.Controls.Add(this.StartSecondTestButton);
            this.Controls.Add(this.StopFirstTestButton);
            this.Controls.Add(this.StartFirstTestButtonClick);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button StartFirstTestButtonClick;
        private System.Windows.Forms.Button StopFirstTestButton;
        private System.Windows.Forms.Button StartSecondTestButton;
        private System.Windows.Forms.Button StopSecondTestButton;
    }
}

